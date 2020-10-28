/*
 * Copyright 2019 Alex Andres
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.config;

import dev.onvoid.webrtc.RTCIceServer;

import java.util.Locale;

public class DefaultConfiguration extends Configuration {

	public DefaultConfiguration() {
		setLocale(Locale.UK);

		getAudioConfiguration().setReceiveAudio(true);
		getAudioConfiguration().setSendAudio(true);

		getVideoConfiguration().setReceiveVideo(true);
		getVideoConfiguration().setSendVideo(true);

		getDesktopCaptureConfiguration().setFrameRate(15);

		RTCIceServer iceServer = new RTCIceServer();
		iceServer.urls.add("stun:stun.l.google.com:19302");

		getRTCConfig().iceServers.add(iceServer);
	}

}
