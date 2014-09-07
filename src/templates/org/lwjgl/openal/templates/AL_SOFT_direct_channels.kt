/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_direct_channels = "SOFTDirectChannels".nativeClassAL("SOFT_direct_channels") {
	documentation = "bindings to AL_SOFT_direct_channels extension."

	IntConstant.block(
		"Accepted by the {@code paramName} parameter of alSourcei, alSourceiv, alGetSourcei, and alGetSourceiv.",

		"DIRECT_CHANNELS_SOFT" _ 0x1033
	)
}