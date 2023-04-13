package blind.project.dto

class ResponseDTO<T>(
    var error: String? = null,
    var data: List<T>? = null
)