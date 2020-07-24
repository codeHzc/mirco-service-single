package com.hzc.common.db.page;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasePage<T> extends Page<T> {

    @Override
    public IPage<T> setAscs(List<String> ascs) {
        return super.setAscs(ascs.stream().map(StrUtil::toUnderlineCase).collect(Collectors.toList()));
    }

    @ApiModelProperty(hidden = true)
    @Override
    public List<T> getRecords() {
        return super.getRecords();
    }

    @ApiModelProperty(hidden = true)
    @Override
    public long getTotal() {
        return super.getTotal();
    }

    @Override
    public IPage<T> setAsc(String... ascs) {
        return super.setAsc(Arrays.stream(ascs).map(StrUtil::toUnderlineCase).collect(Collectors.joining()));
    }

    @ApiModelProperty(value = "增序字段数组")
    public String[] getAscs() {
        return super.ascs();
    }

    @ApiModelProperty(value = "降序字段数组")
    public String[] getDescs() {
        return super.descs();
    }

    @Override
    public IPage<T> setDescs(List<String> descs) {
        return super.setDescs(descs.stream().map(StrUtil::toUnderlineCase).collect(Collectors.toList()));
    }

    @Override
    public IPage<T> setDesc(String... descs) {
        return super.setDesc(Arrays.stream(descs).map(StrUtil::toUnderlineCase).collect(Collectors.joining()));
    }

    @ApiModelProperty(value = "页面大小")
    @Override
    public long getSize() {
        return super.getSize();
    }

    @ApiModelProperty(value = "当前页面")
    @Override
    public long getCurrent() {
        return super.getCurrent();
    }
}

