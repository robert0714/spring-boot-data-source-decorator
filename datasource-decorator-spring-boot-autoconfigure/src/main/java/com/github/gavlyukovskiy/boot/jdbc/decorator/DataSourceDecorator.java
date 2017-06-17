/*
 * Copyright 2017 the original author or authors.
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

package com.github.gavlyukovskiy.boot.jdbc.decorator;

import javax.sql.DataSource;

/**
 * Decorator for context {@link DataSource} beans.
 *
 * @author Arthur Gavlyukovskiy
 */
public interface DataSourceDecorator {

    /**
     * Decorates given {@link DataSource} instance.
     * Should either return wrapped {@link DataSource} or same instance.
     *
     * @param beanName name of a bean
     * @param dataSource bean instance
     *
     * @return decorated {@link DataSource} or given {@param dataSource} without changes.
     */
    DataSource decorate(String beanName, DataSource dataSource);
}
