/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_demote_to_helper_invocation = "EXTShaderDemoteToHelperInvocation".nativeClassVK("EXT_shader_demote_to_helper_invocation", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds Vulkan support for the {@code SPV_EXT_demote_to_helper_invocation} SPIR-V extension. That SPIR-V extension provides a new instruction {@code OpDemoteToHelperInvocationEXT} allowing shaders to "demote" a fragment shader invocation to behave like a helper invocation for its duration. The demoted invocation will have no further side effects and will not output to the framebuffer, but remains active and can participate in computing derivatives and in subgroup operations. This is a better match for the "discard" instruction in HLSL.

        <h5>Examples</h5>
        None.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_demote_to_helper_invocation}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>277</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_shader_demote_to_helper_invocation:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-06-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_DEMOTE_TO_HELPER_INVOCATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_DEMOTE_TO_HELPER_INVOCATION_EXTENSION_NAME".."VK_EXT_shader_demote_to_helper_invocation"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES_EXT".."1000276000"
    )
}