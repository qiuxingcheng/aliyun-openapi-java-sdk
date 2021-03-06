/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteCasterEpisodeGroupRequest extends RpcAcsRequest<DeleteCasterEpisodeGroupResponse> {
	
	public DeleteCasterEpisodeGroupRequest() {
		super("live", "2016-11-01", "DeleteCasterEpisodeGroup", "live");
	}

	private Long ownerId;

	private String programId;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getProgramId() {
		return this.programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
		if(programId != null){
			putQueryParameter("ProgramId", programId);
		}
	}

	@Override
	public Class<DeleteCasterEpisodeGroupResponse> getResponseClass() {
		return DeleteCasterEpisodeGroupResponse.class;
	}

}
