/*
 * Copyright 2012 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.jersey.tests;

import org.atmosphere.cpr.AtmosphereConfig;
import org.atmosphere.cpr.BroadcasterConfig;
import org.atmosphere.jersey.JerseyBroadcaster;

/**
 * Simple {@link org.atmosphere.cpr.BroadcasterConfig}
 */
public class RecyclableBroadcaster extends JerseyBroadcaster {

    public RecyclableBroadcaster(String name, AtmosphereConfig config) {
        super(name, config);
    }

    /**
     * {@inheritDoc}
     */
    public void destroy() {
        setScope(SCOPE.APPLICATION);
    }
}