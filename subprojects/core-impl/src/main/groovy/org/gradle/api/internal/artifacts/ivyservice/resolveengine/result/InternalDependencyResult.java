/*
 * Copyright 2012 the original author or authors.
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

package org.gradle.api.internal.artifacts.ivyservice.resolveengine.result;

import org.gradle.api.Nullable;
import org.gradle.api.artifacts.ModuleVersionIdentifier;
import org.gradle.api.artifacts.ModuleVersionSelector;

/**
 * by Szczepan Faber, created at: 8/24/12
 */
public class InternalDependencyResult {

    private final ModuleVersionSelector requested;
    private final ModuleVersionIdentifier selected;
    private final Exception failure;
    public String reason;

    public InternalDependencyResult(ModuleVersionSelector requested, ModuleVersionIdentifier selected, Exception failure) {
        assert requested != null;
        this.requested = requested;
        this.selected = selected;
        this.failure = failure;
    }

    public ModuleVersionSelector getRequested() {
        return requested;
    }

    @Nullable
    public ModuleVersionIdentifier getSelected() {
        return selected;
    }

    @Nullable
    public Exception getFailure() {
        return failure;
    }

    public String getReason() {
        return reason;
    }
}