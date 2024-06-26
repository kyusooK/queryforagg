package untitled.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory", url = "${api.url.inventory}")
public interface InventoryService {
    @GetMapping(path = "/inventories/{id}")
    public Inventory checkStock(@PathVariable("id") Long id);
}
