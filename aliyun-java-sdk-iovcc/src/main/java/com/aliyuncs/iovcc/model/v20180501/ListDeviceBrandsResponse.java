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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListDeviceBrandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceBrandsResponse extends AcsResponse {

	private String requestId;

	private List<DeviceBrandsItem> deviceBrands;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DeviceBrandsItem> getDeviceBrands() {
		return this.deviceBrands;
	}

	public void setDeviceBrands(List<DeviceBrandsItem> deviceBrands) {
		this.deviceBrands = deviceBrands;
	}

	public static class DeviceBrandsItem {

		private Long deviceBrandId;

		private String deviceBrand;

		private String projectId;

		private String manufacture;

		private String description;

		public Long getDeviceBrandId() {
			return this.deviceBrandId;
		}

		public void setDeviceBrandId(Long deviceBrandId) {
			this.deviceBrandId = deviceBrandId;
		}

		public String getDeviceBrand() {
			return this.deviceBrand;
		}

		public void setDeviceBrand(String deviceBrand) {
			this.deviceBrand = deviceBrand;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getManufacture() {
			return this.manufacture;
		}

		public void setManufacture(String manufacture) {
			this.manufacture = manufacture;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListDeviceBrandsResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceBrandsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
