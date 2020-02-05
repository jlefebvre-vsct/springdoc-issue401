package demo.component.controller.hateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

import demo.component.controller.ComponentsController;
import demo.component.dto.DemoComponentDto;

@Component
public class DemoComponentDtoModelProcessor implements RepresentationModelProcessor<EntityModel<DemoComponentDto>> {

	@Override
	public EntityModel<DemoComponentDto> process(EntityModel<DemoComponentDto> model) {
		final String id = model.getContent().getId();

		model.add(linkTo(methodOn(ComponentsController.class).findById(id)).withSelfRel());

		return model;
	}

}
