package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class AlbumTest {
    @Autowired
    AlbumMapper mapper;

    @Test
    void insert() {
        Album album = new Album();
        album.setName("苗澳澳名称1");
        album.setDescription("苗傲傲说明1");
        album.setSort(15);
        int row = mapper.insert(album);
        System.out.println("受影响的行数为" + row);
        System.out.println(album.toString());
    }

    @Test
    void deleteById() {
        Long id = 7l;
        int row = mapper.deleteById(id);
        System.out.println("受影响的行数为" + row);
    }

    @Test
    void update() {
        Album album = new Album();
        album.setId(6l);
        album.setName("修改苗澳澳名称");
        album.setDescription("修改苗傲傲说明");
        album.setSort(88);
        int row = mapper.update(album);
        System.out.println("受影响的行数为" + row);
    }

    @Test
    void countByName() {
        String name = "测试名称1";
        int count = mapper.countByName(name);
        if (count > 0) {
            System.out.println("查询到了" + name);
        } else {
            System.out.println("没有查询到{{" + name + "}}" + "该数据!");
        }

    }

    @Test
    void selectById() {
        Long id = 6l;
        Album album = mapper.selectById(id);
        if (album != null) {
            System.out.println(album.toString());
        } else {
            System.out.println("没有查询到{{" + id + "}}" + "该数据!");
        }

    }

    @Test
    void selectList() {
        ArrayList<Album> album = mapper.selectList();
        if (album.size() != 0) {
            for (Album alb : album) {
                System.out.println(alb.toString());
            }
        } else {
            System.out.println("没有查询到数据!");
        }

    }
}
