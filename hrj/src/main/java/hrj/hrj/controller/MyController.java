package hrj.hrj.controller;

import hrj.hrj.service.*;
import hrj.hrj.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.sf.json.JSONObject;

@RestController
public class MyController {

    @Autowired
    private TimelogService timelogService;

    @RequestMapping("/")
    String home() {
        Timelog tl = timelogService.selectByPrimaryKey(1);
        JSONObject jsonObject = JSONObject.fromObject(tl); // Java Bean转JSON
        return jsonObject.toString();

    }
}