/*
 * Offloading Server -  ULOOF Project
 *
 * Copyright (C) 2017-2018  Stefano Secci <stefano.secci@cnam.fr>
 * Copyright (C) 2017-2018  Alessio Diamanti <alessio.diama@gmail.com>
 * Copyright (C) 2017-2018  Alessio Mora	<mora.alessio20@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU  General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; If not, see <http://www.gnu.org/licenses/>.
 */

package br.com.lealdn.server;

import br.com.lealdn.server.responses.ExecuteResponseHandler;
import br.com.lealdn.server.responses.PingResponseHandler;

/*
	Two kinds of Responses: Execute and Ping.
	Ping is just used to test if the Server is up and reachable.
 */
public enum Responses {
	EXECUTE("/execute", new ExecuteResponseHandler()),
	PING("/ping", new PingResponseHandler());
	
	final String path;
	final ResponseHandler handler;
	
	Responses(String path, ResponseHandler handler) {
		this.path = path;
		this.handler = handler;
	}
}
