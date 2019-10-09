package executor.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * Copyright：botBrain.ai
 * Author: WangMingChao
 * Date: 2019/9/29.
 * Description:
 */
@JobHandler(value = "bot-job-003")
@Component
public class DemoJobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        for (int i = 0; i < 5; i++) {
            XxlJobLogger.log("Hello ,布本智能003"+i);
        }
        return ReturnT.SUCCESS;
    }
}
