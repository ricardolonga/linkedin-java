/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package org.linkedin.schema;

public class Visibility
{
	public String code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link VisibilityType }
     *     
     */
    VisibilityType getCode()
    {
    	if (code!=null)
    	{
    		if (code.equals("anyone"))
    			return VisibilityType.ANYONE;
    		if (code.equals("all-members"))
    			return VisibilityType.ALL_MEMBERS;
    		if (code.equals("connections-only"))
    			return VisibilityType.CONNECTIONS_ONLY;
    	}
        return null;
    }
}
