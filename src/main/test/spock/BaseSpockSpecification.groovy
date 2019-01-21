package spock

import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * @Auther: ghw06* @Date: 2018/12/19
 * @Description:
 */
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
class BaseSpockSpecification extends Specification {
}
