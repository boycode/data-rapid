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

package org.datarapid.core.databuilder.datatypes;

import org.datarapid.core.databuilder.DataGenerator;
import org.datarapid.core.util.DateGenerator;

import java.util.List;

/**
 * @Description This class will generate list of random date between the
 * StartDate and the EndDate.The user will have to give the input
 * in the dd/mm/yyyy format only and then he can specify his own
 * desired output format using the # separator . The format is
 * "StartDate-EndDate#outputSimpleDateFormat" for ex:-
 * 01/01/1993-01/01/1994#mm/dd/yyyy
 */
public class Date implements DataGenerator {

    public List<String> getColumn(String values, int numRows) {
        DateGenerator dateGenerator = new DateGenerator();
        List<String> list = dateGenerator.generateDate(values.trim(), numRows);
        return list;
    }

}
