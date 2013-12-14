/*
 * Zed Attack Proxy (ZAP) and its related class files.
 * 
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 * 
 * Copyright 2013 The ZAP Development Team
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */
package org.zaproxy.zap.extension.zest;

import org.mozilla.zest.core.v1.ZestConditional;
import org.parosproxy.paros.Constant;
import org.parosproxy.paros.extension.ExtensionPopupMenuItem;

public class ZestAddConditionMenu extends ExtensionPopupMenuItem {

	private static final long serialVersionUID = 2282358266003940700L;
	
	private ZestConditional ca = null;
	
	public ZestAddConditionMenu(ZestConditional ca) {
		super(ZestZapUtils.toUiString(ca, false));
		this.ca = ca;
	}
	
    public ZestConditional getConditional() {
		return ca;
	}

	@Override
    public String getParentMenuName() {
    	return Constant.messages.getString("zest.condition.add.popup");
    }
    
    @Override
    public boolean isSubMenu() {
    	return true;
    }

    @Override
    public boolean isSafe() {
    	return true;
    }
}