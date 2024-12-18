/*
 * Copyright (C) 2020 Seomse Inc.
 *
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
package io.runon.jdbc.sequence;

import io.runon.jdbc.JdbcQuery;

/**
 * maria 유형의 시퀀스 생성기
 * @author macle
 */
public class MariaSequenceMaker implements SequenceMaker{

    @Override
    public String nextVal(String sequenceName) {
        return JdbcQuery.getResultOne("SELECT NEXT VALUE FOR " + sequenceName);
    }

    @Override
    public long nextLong(String sequenceName) {
        return JdbcQuery.getResultLong("SELECT NEXT VALUE FOR " + sequenceName);
    }

}