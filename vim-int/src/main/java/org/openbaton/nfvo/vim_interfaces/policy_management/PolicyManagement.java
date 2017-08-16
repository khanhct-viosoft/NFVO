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

package org.openbaton.nfvo.vim_interfaces.policy_management;

import java.util.List;
import org.openbaton.catalogue.mano.descriptor.Policy;

/** Created by mpa on 30/04/15. */
public interface PolicyManagement {

  /**
   * This operation allows defining policy rules include conditions and actions.
   *
   * @return the {@link Policy} created
   */
  Policy create();

  /**
   * This operation allows updating an existing policy.
   *
   * @return the {@link Policy} updated
   */
  Policy update();

  /** This operation allows delete policy after being created. */
  void delete();

  /**
   * This operation allows querying about a particular policy or a querying the list of available
   * policies.
   *
   * @return the List of available {@link Policy}
   */
  List<Policy> query();

  /** This operation enables activating an available policy. */
  void activate();

  /** This operation enables de-activating an active policy. */
  void deactivate();
}