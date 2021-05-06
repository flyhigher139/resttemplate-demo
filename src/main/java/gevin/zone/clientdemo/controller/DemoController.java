package gevin.zone.clientdemo.controller;

import gevin.zone.clientdemo.vo.CameraInfo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author gevin
 */
@RestController
@RequestMapping("/")
public class DemoController {
    @Resource
    RestTemplate restTemplate;

    @GetMapping()
    public String hello() {
        return "hello";
    }

    @PostMapping(path = "/camera/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCamera2(@RequestBody Map<String, String> map) {
        String url = "http://47.114.180.252:8092/api/get_camera_list_one_project";
        return restTemplate.postForEntity(url, map, String.class);
    }

    @PostMapping(path = "/camera3", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, List<CameraInfo>> getCamera3(@RequestBody Map<String, String> map) {
        String url = "http://47.114.180.252:8092/api/get_camera_list_one_project";
        ResponseEntity<Map> resp = restTemplate.postForEntity(url, map, Map.class);
        return resp.getBody();
    }



    @PostMapping(path = "/camera", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getCamera(@RequestBody Map<String, String> map) {
        String url = "http://47.114.180.252:8092/api/get_camera_list_one_project";
        ResponseEntity<String> resp = restTemplate.postForEntity(url, map, String.class);
        return resp.getBody();
    }
}
