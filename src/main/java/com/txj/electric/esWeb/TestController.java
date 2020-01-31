package com.txj.electric.esWeb;

import com.txj.electric.esEntity.TestBean;
import com.txj.electric.esService.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author: pyfysf
 * <p>
 * @qq: 337081267
 * <p>
 * @CSDN: http://blog.csdn.net/pyfysf
 * <p>
 * @blog: http://wintp.top
 * <p>
 * @email: pyfysf@163.com
 * <p>
 */
@RestController
@RequestMapping("/testes")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("findAll")
    public Iterable<TestBean> findAll() {

        return testService.findAll();
    }

    @RequestMapping("list")
    public String save() {
        List<TestBean> list = null;
        testService.save(list);

        return "success";
    }

    @RequestMapping("save")
    public void save(TestBean bean) {
        testService.save(bean);
    }

    @RequestMapping("findByName")
    public List<TestBean> findByName(String name) {
        return testService.findByName(name);
    }

    @RequestMapping("findByNameOrDesc")
    public List<TestBean> findByNameOrDesc(String text) {
        return testService.findByNameOrDesc(text);
    }

    /**
     * @author: 官昌洪
     * @Description: 高级查询，分词，高亮
     * @Date: 2020/1/31 9:41
     * @Param:
     * @return:
     */
    @RequestMapping("improveSearch")
    public List<TestBean> improveSearch(String text) {
        return testService.improveSearch(text);
    }

    /**
     * @author: 官昌洪
     * @Description: 普通分页
     * @Date: 2020/1/31 9:41
     * @Param:
     * @return:
     */
    @RequestMapping("searchPage")
    public List<TestBean> searchPage() {
        return testService.searchPage();
    }

    /**
     * @author: 官昌洪
     * @Description: 精确匹配
     * @Date: 2020/1/31 9:41
     * @Param:
     * @return:
     */
    @RequestMapping("searchTerm")
    public List<TestBean> searchTerm(String text) {
        return testService.searchTerm(text);
    }

    /**
     * @author: 官昌洪
     * @Description: 模糊匹配
     * @Date: 2020/1/31 9:41
     * @Param:
     * @return:
     */
    @RequestMapping("searchMatch")
    public List<TestBean> searchMatch(String text) {
        return testService.searchMatch(text);
    }

    /**
     * @author: 官昌洪
     * @Description: 模糊匹配
     * @Date: 2020/1/31 9:41
     * @Param:
     * @return:
     */
    @RequestMapping("searchMultiMatch")
    public List<TestBean> searchMultiMatch(String text) {
        return testService.searchMultiMatch(text);
    }

}

