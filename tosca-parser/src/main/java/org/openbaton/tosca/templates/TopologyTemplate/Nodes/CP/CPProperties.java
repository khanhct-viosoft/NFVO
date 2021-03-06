/*
 * Copyright (c) 2016 Open Baton (http://www.openbaton.org)
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
 *
 */

package org.openbaton.tosca.templates.TopologyTemplate.Nodes.CP;

import java.util.Map;

/** Created by rvl on 17.08.16. */
public class CPProperties {

  private String type = null;
  private String floatingIP = null;
  private int interfaceId = 0;

  @SuppressWarnings({"unsafe", "unchecked"})
  public CPProperties(Object properties) {
    Map<String, Object> propertiesMap = (Map<String, Object>) properties;

    if (propertiesMap.containsKey("type")) {
      this.type = (String) propertiesMap.get("type");
    }

    if (propertiesMap.containsKey("floatingIP")) {
      this.floatingIP = (String) propertiesMap.get("floatingIP");
    }

    if (propertiesMap.containsKey("interfaceId")) {
      this.interfaceId = (Integer) propertiesMap.get("interfaceId");
    }
  }

  public int getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(int interfaceId) {
    this.interfaceId = interfaceId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getFloatingIP() {
    return floatingIP;
  }

  public void setFloatingIP(String floatingIP) {
    this.floatingIP = floatingIP;
  }

  @Override
  public String toString() {
    return "CP Properties: \n" + "Type: " + type + "\n" + "FloatingIp: " + floatingIP + "\n";
  }
}
