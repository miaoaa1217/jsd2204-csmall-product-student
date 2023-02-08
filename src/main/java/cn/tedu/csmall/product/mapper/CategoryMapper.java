package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandMapper {
    int insert(Brand brand);

    int deleteById(Long id);
}
