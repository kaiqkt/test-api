package com.kaiqkt.testapi.application.config

import com.kaiqkt.testapi.domain.utils.MetricsUtils
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Configuration

@Configuration
class MetricsConfig(
    registry: MeterRegistry,
) {
    init {
        MetricsUtils.init(registry)
    }
}
