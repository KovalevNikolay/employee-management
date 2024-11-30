package ru.liga.management.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import ru.liga.management.model.dto.request.EmployeeRequest;
import ru.liga.management.model.dto.response.EmployeeResponse;
import ru.liga.management.model.entity.Employee;

import java.util.List;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {EmployeeMapperUtil.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface EmployeeMapper {

    @Mapping(target = "leader", source = "leaderId", qualifiedByName = {"EmployeeMapperUtil", "getEmployeeFromId"})
    Employee toEntity(EmployeeRequest request);

    @Mapping(target = "leader", qualifiedByName = "mapLeader")
    EmployeeResponse toResponse(Employee entity);

    @Named("mapLeader")
    @Mapping(target = "leader", ignore = true)
    EmployeeResponse mapLeader(Employee leader);

    List<EmployeeResponse> toResponseList(List<Employee> entities);
}