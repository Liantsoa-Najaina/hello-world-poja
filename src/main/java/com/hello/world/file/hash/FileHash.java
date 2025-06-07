package com.hello.world.file.hash;

import com.hello.world.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
