package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new vn.xdeuhug.movieXD.DataBinderMapperImpl());
    addMapper("vn.xdeuhug.movieXD");
  }
}
