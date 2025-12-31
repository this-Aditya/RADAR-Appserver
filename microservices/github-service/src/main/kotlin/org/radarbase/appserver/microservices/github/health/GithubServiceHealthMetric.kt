/*
 * Copyright 2025 King's College London
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.radarbase.appserver.microservices.github.health

import org.radarbase.jersey.service.HealthService


class GithubServiceHealthMetric(
) : HealthService.Metric("github-service") {
    override suspend fun computeStatus(): HealthService.Status = try {
        // TODO: Add health check metrics
        HealthService.Status.UP
    } catch (ex: Throwable) {
        HealthService.Status.DOWN
    }

    override suspend fun computeMetrics(): Map<String, Any> = mapOf("status" to computeStatus())
}
