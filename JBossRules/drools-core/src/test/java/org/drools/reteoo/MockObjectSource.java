package org.drools.reteoo;

/*
 * Copyright 2005 JBoss Inc
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

import org.drools.spi.PropagationContext;

public class MockObjectSource extends ObjectSource {
    /**
     * 
     */
    private static final long serialVersionUID = 5137841417495725497L;

    private int               attached;

    private int               updated;

    public MockObjectSource(final int id) {
        super( id );
    }

    public void attach() {
        this.attached++;

    }

    public int getAttached() {
        return this.attached;
    }

    public int getUdated() {
        return this.updated;
    }

    public void updateNewNode(final ReteooWorkingMemory workingMemory,
                              final PropagationContext context) {
        this.updated++;
    }

    public void remove(final BaseNode node,
                       final ReteooWorkingMemory[] workingMemories) {
        // TODO Auto-generated method stub

    }

    public void attach(final ReteooWorkingMemory[] workingMemories) {
        // TODO Auto-generated method stub

    }

}