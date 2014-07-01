package org.zaproxy.zap.extension.accessControl.widgets;

import java.util.Enumeration;

import javax.swing.tree.DefaultMutableTreeNode;

import org.apache.commons.httpclient.URI;

public class SiteTreeNode extends DefaultMutableTreeNode {

	private static final long serialVersionUID = -1543727391908747535L;

	private String nodeName;
	private URI uri;

	public SiteTreeNode(String nodeName, URI uri) {
		super();
		this.nodeName = nodeName;
		this.uri = uri;
	}

	public String getNodeName() {
		return nodeName;
	}

	public URI getUri() {
		return uri;
	}

	public SiteTreeNode findChild(String nodeName) {
		if (nodeName == null)
			return null;

		@SuppressWarnings("unchecked")
		Enumeration<SiteTreeNode> children = this.children();

		while (children.hasMoreElements()) {
			SiteTreeNode child = children.nextElement();
			if (child.getNodeName().equals(nodeName)) {
				return child;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return nodeName + " (" + uri + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeName == null) ? 0 : nodeName.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SiteTreeNode other = (SiteTreeNode) obj;
		if (nodeName == null) {
			if (other.nodeName != null)
				return false;
		} else if (!nodeName.equals(other.nodeName))
			return false;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		return true;
	}

}