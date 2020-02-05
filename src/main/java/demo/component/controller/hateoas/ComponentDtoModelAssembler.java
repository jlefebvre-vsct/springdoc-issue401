package demo.component.controller.hateoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import demo.component.dto.DemoComponentDto;
import demo.component.dto.converter.DemoComponentConverter;
import demo.component.model.DemoComponent;

@Component
public class ComponentDtoModelAssembler implements RepresentationModelAssembler<DemoComponent, RepresentationModel<EntityModel<DemoComponentDto>>> {

	@Autowired
	private DemoComponentConverter toDtoConverter;

	@Override
	public RepresentationModel<EntityModel<DemoComponentDto>> toModel(DemoComponent entity) {
		return new EntityModel<DemoComponentDto>(toDtoConverter.convert(entity));
	}

}
