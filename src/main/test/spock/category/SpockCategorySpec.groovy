package spock.category

import com.grow.controller.CategoryController
import org.springframework.test.web.servlet.MockMvc
import spock.BaseSpockSpecification
import spock.lang.Shared
import spock.lang.Subject
import spock.lang.Title

/**
 * @Auther: ghw0614
 * @Date: 2018/12/19
 * @Description:
 */
@Title("测试下案例控制器")
@Subject(CategoryController)
class SpockCategorySpec extends BaseSpockSpecification {

    @Shared
    private MockMvc mockMvc;

    def "Test Restful Post"(){

    }
}
