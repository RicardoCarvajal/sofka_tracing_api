package com.sofka.service.app.infraestructure.entryPoint.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.sofka.service.app.domain.useCase.GetAllMovementErrorUseCase;
import com.sofka.service.app.domain.useCase.GetAllMovementProductUseCase;
import com.sofka.service.app.domain.useCase.GetAllMovementUseCase;

import reactor.core.publisher.Mono;

@Component
public class MovementHandler {

	private final GetAllMovementUseCase getAllMovementUseCase;

	private final GetAllMovementErrorUseCase getAllMovementErrorUseCase;

	private final GetAllMovementProductUseCase getAllMovementProductUseCase;

	public MovementHandler(GetAllMovementUseCase getAllMovementUseCase,
			GetAllMovementErrorUseCase getAllMovementErrorUseCase,
			GetAllMovementProductUseCase getAllMovementProductUseCase) {
		this.getAllMovementUseCase = getAllMovementUseCase;
		this.getAllMovementErrorUseCase = getAllMovementErrorUseCase;
		this.getAllMovementProductUseCase = getAllMovementProductUseCase;
	}

	public Mono<ServerResponse> get(ServerRequest request) {

		return getAllMovementUseCase.get().collectList().flatMap(list -> {
			return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(list);
		});

	}

	public Mono<ServerResponse> getError(ServerRequest request) {

		return getAllMovementErrorUseCase.getError().collectList().flatMap(list -> {
			return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(list);
		});

	}

	public Mono<ServerResponse> getMovementProduct(ServerRequest request) {

		String id = request.pathVariable("id");

		return getAllMovementProductUseCase.getMovementProduct(id).collectList().flatMap(list -> {
			return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(list);
		});

	}
}
