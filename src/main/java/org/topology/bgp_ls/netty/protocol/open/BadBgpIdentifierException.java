/**
 *  Copyright 2012 Rainer Bieniek (Rainer.Bieniek@web.de)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 * File: org.topology.bgp_ls.netty.protocol.BadBgpIdentifierException.java 
 */
package org.topology.bgp_ls.netty.protocol.open;

import org.topology.bgp_ls.netty.protocol.NotificationPacket;

/**
 * @author Rainer Bieniek (Rainer.Bieniek@web.de)
 *
 */
public class BadBgpIdentifierException extends OpenPacketException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7669781009811724080L;

	/**
	 * 
	 */
	public BadBgpIdentifierException() {
	}

	/**
	 * @param message
	 */
	public BadBgpIdentifierException(String message) {
		super(message);
	}

	@Override
	public NotificationPacket toNotificationPacket() {
		return new BadBgpIdentifierNotificationPacket();
	}

}
