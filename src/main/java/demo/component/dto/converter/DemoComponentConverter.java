package demo.component.dto.converter;

import org.springframework.stereotype.Component;

import demo.component.dto.DemoComponentDto;
import demo.component.model.DemoComponent;
import demo.utils.Converter;

@Component
public class DemoComponentConverter implements Converter<DemoComponent, DemoComponentDto> {

	@Override
	public DemoComponentDto convert(DemoComponent source) {
		if (source == null) {
			return null;
		}

		return DemoComponentDto.builder() //
				.id(source.getId()) //
				.payload(source.getPayload()) //
				.build();
	}

}
