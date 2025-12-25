package ${package}.application.config

import ${package}.domain.utils.MetricsUtils
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
