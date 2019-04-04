/*
 * Copyright 2018 Infosys Ltd.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.datarapid.core.persistence.transactionservice;

import org.datarapid.core.persistence.model.RoleInformation;

import java.util.List;

/**
 * @Description Role Info Service Interface
 */

public interface RoleInfoService {

    /**
     * @Description To retrieve all the roles
     */

    List<RoleInformation> listRoles();

    /**
     * @Description To add a role
     */

    boolean addRole(RoleInformation roleInformation);

    /**
     * @Description To retrieve a specific role
     */

    List<RoleInformation> getRole(String userName);

    /**
     * @Description To delete the role
     */

    boolean deleteRole(RoleInformation roleInformation);


    /**
     * @Description To update an role
     */

    boolean updateRole(RoleInformation roleInformation);


    /**
     * @Description checking whether the role is active or not
     */

    boolean isRoleActive(String userName);

}
