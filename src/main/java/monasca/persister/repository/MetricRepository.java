/*
 * Copyright (c) 2014 Hewlett-Packard Development Company, L.P.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package monasca.persister.repository;

public interface MetricRepository {
  void addMetricToBatch(Sha1HashId defDimsId, String timeStamp, double value);
  
  void addMetricToBatch(Sha1HashId defDimsId, String timeStamp, String value);

  void addDefinitionToBatch(Sha1HashId defId, String name, String tenantId, String region);

  void addDimensionToBatch(Sha1HashId dimSetId, String name, String value);

  void addDefinitionDimensionToBatch(Sha1HashId defDimsId, Sha1HashId defId, Sha1HashId dimId);

  void flush();
}
