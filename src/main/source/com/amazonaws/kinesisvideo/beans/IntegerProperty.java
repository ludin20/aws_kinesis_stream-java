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

package com.amazonaws.kinesisvideo.beans;

/**
 * Integer property implementation.
 *
 * @author Alex Andres
 */
public class IntegerProperty extends ObjectProperty<Integer> {

	/**
	 * Create a IntegerProperty with the initial value set to {@code 0}.
	 */
	public IntegerProperty() {
		this(0);
	}

	/**
	 * Create a IntegerProperty with the specified initial value.
	 *
	 * @param defaultValue The initial value.
	 */
	public IntegerProperty(int defaultValue) {
		set(defaultValue);
	}

}
