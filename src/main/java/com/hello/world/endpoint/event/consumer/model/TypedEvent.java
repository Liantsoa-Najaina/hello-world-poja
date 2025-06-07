package com.hello.world.endpoint.event.consumer.model;

import com.hello.world.PojaGenerated;
import com.hello.world.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
