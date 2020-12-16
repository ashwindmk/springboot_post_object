package com.ashwin.api.route;

import com.ashwin.api.dto.ActionDto;
import com.ashwin.api.mapper.ActionMapper;
import com.ashwin.domain.model.Action;
import com.ashwin.domain.model.Layout;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/action")
public class ActionController {
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void updateAction(@RequestBody ActionDto actionDto) {
        System.out.println("ActionDto: " + actionDto);
        Action action = ActionMapper.copyFromObject(actionDto, Action.class);
        Layout layout = ActionMapper.copyFromObject(actionDto.getLayout(), Layout.class);
        System.out.println("Action: " + action + ", Layout: " + layout);
        if (layout != null && layout.getMargin() != null && layout.getMargin().size() == 4) {
            System.out.println("Layout: marginTop: " + layout.getMargin().get(1));
        } else {
            System.out.println("Layout: Invalid!");
        }
    }
}
