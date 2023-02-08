package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.entity.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class BrandMapperTest {
    @Autowired
    BrandMapper mapper;

    @Test
    void insert() {
        Brand brand = new Brand();
        brand.setName("苗澳澳名称1");
        brand.setDescription("苗傲傲说明1");
        brand.setSort(15);
        int row = mapper.insert(brand);
        System.out.println("受影响的行数为" + row);
        System.out.println(brand.toString());
    }

    @Test
    void delete() {
        Long id = 4l;
        int row = mapper.deleteById(id);
        System.out.println("受影响的行数为" + row);
    }
}
