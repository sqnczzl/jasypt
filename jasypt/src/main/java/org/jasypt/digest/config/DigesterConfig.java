/*
 * $Source: /home/daniel/Documents/jasypt-cvsbackup/jasypt/src/main/java/org/jasypt/digest/config/DigesterConfig.java,v $
 * $Revision: 1.3 $
 * $Date: 2007-01-21 18:12:47 $
 *
 * =============================================================================
 * 
 *   Copyright (c) 2007, The JASYPT team (http://www.jasypt.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 */
package org.jasypt.digest.config;

public interface DigesterConfig {

    /* 
     * FOR DOC: If these are null, the current object values are respected 
     */
    
    public String getAlgorithm();
    
    public Integer getSaltSizeBytes();
    
    public Integer getIterations();
    
}
