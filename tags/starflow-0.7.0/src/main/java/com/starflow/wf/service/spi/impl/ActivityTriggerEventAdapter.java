/*
 * Copyright 2010-2011 the original author or authors.
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

package com.starflow.wf.service.spi.impl;

import com.starflow.wf.service.spi.IActivityTriggerEvent;

/**
 * 环节触发事件接口的适配器类
 * 
 * @author libinsong1204@gmail.com
 * @version 1.0
 */
public class ActivityTriggerEventAdapter implements IActivityTriggerEvent {

	@Override
	public void afterComplete(long processInstId, long activityInstId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterStart(long processInstId, long activityInstId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeComplete(long processInstId, long activityInstId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeStart(long processInstId, String activityDefId) {
		// TODO Auto-generated method stub
		
	}

}
