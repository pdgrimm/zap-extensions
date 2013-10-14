/*
 * Zed Attack Proxy (ZAP) and its related class files.
 * 
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 * 
 * Copyright 2013 The ZAP Development team
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
package org.zaproxy.zap.extension.scripts;

import javax.swing.tree.DefaultMutableTreeNode;

import org.parosproxy.paros.Constant;

/**
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class ScriptNode extends DefaultMutableTreeNode {
	private static final long serialVersionUID = 1L;
	private String nodeName = null;
	private ScriptWrapper.Type type = null;
    
	public ScriptNode() {
		// Only use for the root node
        super();
        this.nodeName = Constant.messages.getString("scripts.tree.root");
    }

	public ScriptNode(ScriptWrapper.Type type) {
		this.nodeName = Constant.messages.getString("scripts.type." + type.name().toLowerCase());
		this.type = type;
	}

	public ScriptNode(String name) {
		this.nodeName = name;
	}

	public ScriptNode(ScriptWrapper script) {
		this.nodeName = script.getName();
		this.type  = script.getType();
		this.setUserObject(script);
	}

    @Override
    public String toString() {
        return nodeName;
    }

	public String getNodeName() {
		return nodeName;
	}
	
	protected void setNodeName(String name) {
		this.nodeName = name;
	}
	
	@Override
	public ScriptNode getParent() {
		return (ScriptNode) super.getParent();
	}

	public ScriptWrapper.Type getType() {
		return type;
	}
	
}