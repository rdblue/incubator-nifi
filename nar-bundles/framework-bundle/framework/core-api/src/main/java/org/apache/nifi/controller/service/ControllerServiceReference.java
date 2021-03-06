/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.controller.service;

import java.util.Set;

import org.apache.nifi.controller.ConfiguredComponent;

/**
 * Provides a collection of components that are referencing a Controller Service
 */
public interface ControllerServiceReference {

    /**
     * Returns the component that is being referenced
     *
     * @return
     */
    ControllerServiceNode getReferencedComponent();

    /**
     * Returns a {@link Set} of all components that are referencing this
     * Controller Service
     *
     * @return
     */
    Set<ConfiguredComponent> getReferencingComponents();

    /**
     * Returns a {@link Set} of all Processors and Reporting Tasks that are
     * referencing the Controller Service and are running, in addition to all
     *
     * @return
     */
    Set<ConfiguredComponent> getRunningReferences();
}
