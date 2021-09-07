package org.zhongweixian.api.configration.fastdfs;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

@Component
public class FastDFSClientWrapper {

    @Autowired
    private FastFileStorageClient storageClient;


    public String uploadFile(byte[] bytes, String callId) {
        InputStream inputStream = new ByteArrayInputStream(bytes);
        StorePath path = storageClient.uploadFile(inputStream, bytes.length, callId, null);
        return path.getFullPath();
    }
}