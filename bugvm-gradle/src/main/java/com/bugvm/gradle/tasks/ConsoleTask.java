/*
 * Copyright (C) 2015 RoboVM AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.gradle.tasks;

import org.gradle.api.GradleException;
import com.bugvm.compiler.AppCompiler;
import com.bugvm.compiler.config.Arch;
import com.bugvm.compiler.config.Config;
import com.bugvm.compiler.config.OS;
import com.bugvm.compiler.target.ConsoleTarget;
import com.bugvm.compiler.target.LaunchParameters;

/**
 *
 */
public class ConsoleTask extends AbstractBugVMTask {

    @Override
    public void invoke() {
        try {
            Arch arch = Arch.getDefaultArch();
            if (extension.getArch() != null) {
                arch = Arch.valueOf(extension.getArch());
            }

            AppCompiler compiler = build(OS.getDefaultOS(), arch, ConsoleTarget.TYPE);
            Config config = compiler.getConfig();
            LaunchParameters launchParameters = config.getTarget().createLaunchParameters();
            compiler.launch(launchParameters);
        } catch (Throwable t) {
            throw new GradleException("Failed to launch console application", t);
        }
    }
}
