package demo.component.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import demo.component.model.DemoComponent;

@Service
public class ComponentsService {

	private static final Map<String, DemoComponent> repo = Collections.singletonMap("1", DemoComponent.builder().id("1").payload("Hello World !").build());

	public Optional<DemoComponent> findById(String componentId) {
		return Optional.ofNullable(repo.get(componentId));
	}

	public Page<DemoComponent> findAll(Pageable pageable) {
		return new PageImpl<DemoComponent>(new ArrayList<>(repo.values()), pageable, repo.size());
	}

}
