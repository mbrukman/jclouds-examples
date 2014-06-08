/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.examples.blobstore.osgi;

import java.io.IOException;

public interface BlobStoreService {

    /**
     * Reads an Object from the Blob Store.
     * @param bucket
     * @param blobName
     * @return
     */
     Object read(String bucket, String blobName);

    /**
     * Writes an {@link Object} to the Blob Store.
     * @param bucket
     * @param blobName
     * @param object
     */
     void write(String bucket, String blobName, Object object) throws IOException;

}
