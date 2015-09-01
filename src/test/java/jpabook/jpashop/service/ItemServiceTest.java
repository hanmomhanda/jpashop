package jpabook.jpashop.service;

import jpabook.jpashop.domain.Album;
import jpabook.jpashop.domain.Item;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

/**
 * Created by hanmomhanda on 15. 8. 29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appConfig.xml")
@Transactional
public class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void 상품등록() throws Exception {
        // Given
        Item item = new Album();
        item.setName("알리");

        // When
        itemService.save(item);

        // Then
        assertEquals(item, itemService.findOne(item.getId()));
    }
}
